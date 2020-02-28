pipeline {
    agent any

    stages{
        stage('Preparation') {
            steps {
                git 'https://github.com/NataliaVN/lesson13.git'
            }
        }
        stage('Unit tests') {
            steps{
                sh 'mvn clean -DsuiteXmlFile=unittestng.xml test'
            }
        }
        stage('UI tests') {
            steps{
                sh 'mvn clean -DsuiteXmlFile=testng.xml test'
            }
        }
    }
    post{
        always{
            script {
                allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'allure-results']]
                ])
            }
        }
    }
}