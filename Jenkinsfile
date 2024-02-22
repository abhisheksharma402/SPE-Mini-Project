pipeline{
  agent any

  environment {
		DOCKER_IMAGE_NAME = 'calculator'
		GITHUB_REPO_URL = 'https://github.com/abhisheksharma402/SPE-Mini-Project.git'
	}

  stages{

    stage('Clone Project'){

      steps {

				script{
					git branch: 'main', url: "${GITHUB_REPO_URL}"
				}

			}
      
    }

    stage('Maven Build')
		{
			steps {
        sh 'mvn clean install'
			}
		}

    
    
  }
  
}
