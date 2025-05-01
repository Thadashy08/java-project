pipeline {
    agent { label 'python-agent' }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Thadashy08/java-project.git'
            }
        }

        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
    }

    post {
        always {
            junit 'build/test-results/test/*.xml'
        }
    }
}
