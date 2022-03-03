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
            git url: 'https://github.com/jmagit/CC20200629/tree/master/GildedRose.curso'
            withMaven {
              sh "mvn clean verify"
            }
        }
    }
}
