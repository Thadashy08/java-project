pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Thadashy08/java-project.git'
            }
        }

        stage('Build and Test') {
            steps {
                sh '''
                    mkdir -p out test-reports
                    javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar -d out src/*.java
                    java -cp .:out:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore AppTest \
                        | tee test-reports/results.txt
                '''
            }
        }

        stage('Publish Report') {
            steps {
                junit testResults: 'test-reports/*.xml', allowEmptyResults: true
            }
        }
    }
}
