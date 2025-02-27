pipeline {
    agent any
    stages {
        stage('Check') {
            steps {
                git 'https://github.com/luungocthien/Week6-Demo-InClass.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
    }
}
