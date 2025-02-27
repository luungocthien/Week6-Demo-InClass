pipeline {
    agent any
    stages{
        stage('checking'){
            steps {
                git branch: 'main', url: 'https://github.com/luungocthien/Week6-Demo-InClass.git'

            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage("Test & Coverage"){
            steps{
                bat 'mvn test jacoco:report'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                    jacoco execPattern: '**/target/jacoco.exec',
                            classPattern: '**/target/classes',
                            sourcePattern: '**/src/main/java',
                            exclusionPattern: '**/test/**'

                }
            }
        }
