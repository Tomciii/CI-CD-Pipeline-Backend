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
                echo 'Starting Build'
                    sh "mvn clean test package"
                }
            }
        }

         stage('Send Mail') {
                                steps {
                                    script {
                                    try {
                                                   mail to: 'Tomciiart@gmail.com',
                                                       subject: "Jenkins Job ${env.JOB_NAME} - Build #${env.BUILD_NUMBER}",
                                                       body: "The Jenkins job has completed.\n\nCheck the build at ${env.BUILD_URL}"
                                         } catch(Exception e) {
                                         echo 'Could not send out mail'
                                         }

                                                }
                                }
                            }
    }



    post {
        success {
            echo 'Build succeeded.'
        }
        failure {
            echo 'Build failed. '
        }
    }
}