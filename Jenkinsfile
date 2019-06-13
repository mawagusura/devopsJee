pipeline {
    agent any
        tools { 
        maven 'Maven' 
        jdk 'jdk7' 
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

        stage ('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
        stage ('Deploy') {
            steps {
                sh 'docker cp /var/jenkins_home/workspace/DevOps/target/projetJEEMaven-1.0-SNAPSHOT.war my-tomcat-container:/usr/local/tomcat/webapps/projetJEEMaven.war' 
            }
        }
    }
}
