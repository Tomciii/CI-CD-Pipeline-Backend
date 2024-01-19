pipeline {
    agent any

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