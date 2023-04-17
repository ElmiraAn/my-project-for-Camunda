package com.example.workflow;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class PrepareToBattle implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        //входная переменная, вводимая пользователем, котораярегулирует количество воинов, к
        //которое мы хотим послать в бой
        int warriors = (int) delegateExecution.getVariable("warriors");

        int enemyWarriors = (int) (Math.random()*100);
        String battleStatus = "Undefined";
        boolean isWin = false;

        //если warriors<=0 то

        if (warriors<1 || warriors>100){
            throw new BpmnError("warriorsError");
        }

        //условие, выиграна битва или нет
        if (warriors-enemyWarriors>0){
            isWin = true;
            battleStatus="Victory";
        }else {
            battleStatus="Fail :(";
        }

        delegateExecution.setVariable("enemyWarriors", enemyWarriors);//данные необходимо присвоить переменным процесса
        delegateExecution.setVariable("battleStatus", battleStatus);
        delegateExecution.setVariable("isWin", isWin);

    }
}
