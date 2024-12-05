pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/nikant20/testapp.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
        }
        }
        stage('Deploy') {
            steps {
                sh 'docker cp target/*.jar eager_hamilton:/usr/local/tomcat/webapps/'
                sh 'docker restart eager_hamilton'
            }
        }
    }
}