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
                sh 'mvn clean package'
            }
        }

        stage('Deploy App1') {
            steps {
                sh 'scp -P 2232 target/loginapp.war root@192.168.0.4:/opt/tomcat9/webapps/loginapp.war'
            }
        }

        stage('Deploy App2') {
            steps {
                sh 'scp -P 2232 target/loginapp.war root@192.168.0.5:/opt/tomcat9/webapps/loginapp.war'
            }
        }
    }
}
