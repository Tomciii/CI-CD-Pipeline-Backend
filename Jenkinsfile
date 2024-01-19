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
                echo 'Starting Build'
                    sh "mvn clean test package"
                }
            }
        }
    }

            stage('Send Mail') {
                        steps {
                            script {
                                           mail to: 'Tomciiart@gmail.com',
                                               subject: "Jenkins Job ${env.JOB_NAME} - Build #${env.BUILD_NUMBER}",
                                               body: "The Jenkins job has completed.\n\nCheck the build at ${env.BUILD_URL}"
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