pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], userRemoteConfigs: [[url: 'https://github.com/SamCull/Jenkins.git']]])
            }
        }

        stage('Build and Test') {
            steps {
                script {
                    // Use the system-installed Maven
                    sh 'mvn clean test'
                }
            }
        }
    }

    post {
        success {
            echo 'Build and test successful!'
        }
        failure {
            echo 'Build and test failed!'
        }
    }
}
