pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                withGradle(){
                 sh '/gradlew -v'   
                }
                echo 'Building more shit, finished now'
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
