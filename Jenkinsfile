pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                // Use Maven to build the project and run tests
                script {
                    def mvnHome = tool 'Maven'
                    bat "\"${mvnHome}\\bin\\mvn\" clean test"
                }
            }
        }
    }

post {
    always {
        junit 'surefire-reports/*.xml'
    }
}

}
