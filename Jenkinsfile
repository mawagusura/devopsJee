pipeline {
    agent any
        tools { 
        maven 'Maven' 
        jdk 'jdk8' 
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
        stage ('Test') {
            steps {
                sh 'mvn test' 
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
            }
        }
        stage ('Deploy') {
            steps {
                sh 'docker cp /var/jenkins_home/workspace/DevOps/target/projetJEEMaven-1.0-SNAPSHOT.war my-tomcat-container:/usr/local/tomcat/webapps/devOps.war' 
            }
        }
    }
}
post {
    success{
         slackSend (color: '#00FF00', message: "SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})")
    }
    failure{
         slackSend (color: '#FF0000', message: "FAIL Job: '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})")   
    }
    
}
