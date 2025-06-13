pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
               git branch: 'main',
               url: 'https://github.com/okuorhun/mycalculator.git'
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
        stage ('Publish') {
            steps {
                sh './mvnw package'
            }

            post {
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }

}
