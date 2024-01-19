pipeline {
    agent any
    environment {
        PATH = "C:\\Program Files\\apache-maven-3.9.6\\bin:%PATH"
        }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                script {
                    sh "mvn clean test package"
                }
            }
        }
    }

    post {
        success {
            echo 'Build succeeded. Add post-build actions here if needed.'
        }
        failure {
            echo 'Build failed. Add post-build actions here if needed.'
        }
    }
}