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
        stage ('Notify'){
            steps {
                discordSend description: 'Jenkins Pipeline Build', footer: 'Nice Job :)', link: env.BUILD_URL, result: currentBuild.currentResult, title: JOB_NAME, webhookURL: 'https://discordapp.com/api/webhooks/588725394404802560/NGXpQlHz7RBXb7RzJ3G9E6r7XktX27eAmGq20molyL-xfgMCS-MJIY6TkRDPkRyzRCuo'   
            }
        }
    }
}
