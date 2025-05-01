pipeline {
    agent any

    tools {
        jdk 'jdk-17' 
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/TU-USUARIO/java-project.git'
            }
        }

        stage('Compile') {
            steps {
                sh 'mkdir -p out && javac -d out src/App.java'
            }
        }

        stage('Run') {
            steps {
                sh 'java -cp out App'
            }
        }
    }
}
