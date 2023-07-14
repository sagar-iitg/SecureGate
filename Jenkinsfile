pipeline {
    agent any

    stages {

        stage('Code ') {
            steps {

              echo "Cloning from github"
              git url:'https://github.com/sagar-iitg/SecureGate.git', branch:'dev'


            }
        }


        stage('Test'){
             steps {

            echo "Testing the new build..."


            }


        }


        stage('Deploy'){
             steps {



                   sh "docker-compose down && docker-compose up -d"

            }


        }

    }
}