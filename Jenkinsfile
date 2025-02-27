pipeline {
    agent any
    stages {
        stage('checking') {
            steps {
                git branch: 'main', url: 'https://github.com/luungocthien/Week6-Demo-InClass.git'
            }
        }
        stage('build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
