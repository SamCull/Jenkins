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
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            // Archive the Maven surefire reports
            junit '**/target/surefire-reports/TEST-*.xml'
        }
    }
}
