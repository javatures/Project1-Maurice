pipeline {
    agent any

    stages {
        stage('Build') {
             steps {
                script {
                    try {
                        sh './gradlew clean build' //run a gradle task
                   
                    } 
                    finally{echo 'Finished maybe'}
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
