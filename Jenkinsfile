pipeline {
    agent any

    stages {
        stage('Build') {
             steps {
                script {
                    try {
                        sh 'chmod +x ./gradlew' //run a gradle task
                        sh './gradle build'
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
