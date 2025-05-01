pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Thadashy08/java-project.git'
            }
        }

        stage('Verify Java') {
            steps {
                sh 'which javac'
                sh 'javac -version'
            }
        }

        stage('Build') {
            steps {
                sh '''
                    mkdir -p out
                    javac -d out src/*.java
                '''
            }
        }

        stage('Test') {
            steps {
                sh '''
                    mkdir -p test-reports
                    java -cp out AppTest > test-reports/report.html
                '''
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'test-reports/report.html', fingerprint: true
        }
    }
}
