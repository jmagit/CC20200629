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
            }
        }
        stage('Test') { 
            steps { 
               sh 'mvn -v' 
            }
        }
        stage("Compile") {
            steps { 
                withMaven {
                    bat'mvn clean compile'
                }
            }
        }
    }
}
