pipeline { 
    agent any
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
            }
        }
        stage('Build') { 
            steps { 
                echo 'This is a minimal pipeline.' 
                git url: 'https://github.com/jmagit/CC20200629.git'
                sh 'ls'
            }
        }
        stage('Test') { 
            steps { 
                sh 'mvn -v' 
            }
        }
        stage("Compile") {
            steps { 
                git url: 'https://github.com/jmagit/CC20200629.git'
                withMaven {
                  sh 'ls'
                  sh 'cd ./GildedRose.curso'
                  sh 'mvn clean verify'
                }
            }
        }
    }
}
