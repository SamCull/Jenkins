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
                    def mavenHome = tool 'Maven'
                    sh "${mavenHome}/bin/mvn clean test"
                }
            }
        }
    }

    post {
        always {
            // Archive the Maven Surefire reports
            junit '**/target/surefire-reports/StudentTest-*.xml'
        }
    }
}
