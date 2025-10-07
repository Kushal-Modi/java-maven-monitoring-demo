pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Run') {
            steps {
                bat 'java -cp target/demo-1.0-SNAPSHOT.jar com.example.demo.App &'
            }
        }
    }
}
