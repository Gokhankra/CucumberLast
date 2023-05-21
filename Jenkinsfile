def buildStatus="FAILED"
def slackColor="warning"

pipeline{
    agent any
    triggers{
        cron 'H 2,16 * * *'
    }
    stages{
        stage('Run Tests Stage 12'){
           steps{
              sh './mvnw clean test'
        }
        post{
            always{
                junit '**/surefire-reports/*.xml'
                cucumber buildStatus: 'null', customCssFiles: '', customJsFiles: '', failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: 'target/cucumber.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
            }
            success{
               script{
                  buildStatus="SUCCESS"
               }
            }
      }
   }
  }
}
