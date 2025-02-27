pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/luungocthien/Week6-Demo-InClass.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
