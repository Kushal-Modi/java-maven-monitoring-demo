pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building the project...'
                bat 'mvn clean package'
            }
        }
        stage('Run') {
            steps {
                echo 'Starting the app...'
                bat 'start /B java -cp target/demo-1.0-SNAPSHOT.jar com.example.demo.App'
                sleep(time: 10, unit: 'SECONDS')  // Wait to let app start
                bat 'curl http://localhost:8080'  // Optional: check if running
            }
        }
    }
    post {
        always {
            echo 'Cleaning up...'
            bat 'taskkill /F /IM java.exe || exit 0'  // Stop the Java app
        }
    }
}
