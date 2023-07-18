pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Maven_Home"
    }

    stages {
        stage('Clone') {
            steps {
                // Get some code from a GitHub repository
                echo "Cloning from github"
                git url:'https://github.com/sagar-iitg/SecureGate.git', branch:'pro'
                
            }
        }    
                
        stage('Clean') {
            steps {
                
                echo "Cleaning the project..."
                sh "mvn clean"
            }    
        }
        // stage('Test') { 
        //     steps {
        //         echo "Testing the new build..."
        //         bat "mvn test"
                
        //     } 
        // }
        
        stage('Package') { 
            steps {
                echo "Packaging the new build..."
                sh "mvn package"
                
            } 
        }
        
        stage('Docker Compose Down') { 
            steps {
                echo "Deploy the new build..."
                sh "docker-compose down"
                // bat "npx kill-port 8080"
                // sleep 10
            } 
        }
        
        stage('Docker Compose up') { 
            steps {
                echo "Deploy the new build..."
                sh "docker-compose up"
                
            } 
        }
        
     
        
        
    }   
}
