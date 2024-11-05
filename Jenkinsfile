pipeline {
    agent any
    stages {
        stage('Checkout Main Repo') {
		    steps {
		        checkout([$class: 'GitSCM',
		            branches: [[name: '*/main']],
		            userRemoteConfigs: [[url: 'https://github.com/jaeheoon/Spring-React-server.git']],
		            extensions: [[$class: 'SubmoduleOption', recursiveSubmodules: true, trackingSubmodules: true]]
		        ])
		    }
		}

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
