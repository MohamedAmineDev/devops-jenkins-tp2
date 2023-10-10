pipeline{
    agent any
    tools {
        maven 'maven'
    }
    stages{
        stage ("Clean up"){
            steps{
                deleteDir()
            }
        }
        stage ("Clone repo"){
            steps{
                sh "git clone https://github.com/MohamedAmineDev/devops-jenkins-tp2.git"
            }
        }
        stage ("Generate backend image"){
            steps{
                dir('devops-jenkins-tp2'){
                    sh "mvn clean install "
                    sh " docker build -t docexp1-spring  ."
                }
            }
        }
        stage ("Run docker compose"){
            steps{
                dir("devops-jenkins-tp2"){
                    sh " docker compose up"
                }
            }
        }
    }
}