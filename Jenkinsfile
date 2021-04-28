pipeline {
    agent any

    stages {
        stage('Build') {
             steps {
                script {
                    try {
                        sh './gradlew' //run a gradle task
                    } 
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
