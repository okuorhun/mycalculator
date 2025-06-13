pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
               //git 'https://github.com/okuorhun/testjenkin.git'
               git 'https://github.com/coralogix-resources/java-rest-api-calculator.git'
               // echo 'Hello World'
               sh './mvnw clean compile'
            }
        }
        stage('Test'){
            steps{
                sh './mvnw test'
            }

            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }

}
