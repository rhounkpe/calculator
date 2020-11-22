pipeline {
    agent any
    stages {
        stage("Checkout") {
            steps {
                git url: 'https://github.com/rhounkpe/calculator.git'
            }
        }
        stage('Compile') {
            steps {
                sh 'sh "./gradlew compileJava"'
            }
        }
    }
}