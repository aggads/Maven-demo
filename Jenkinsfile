pipeline {
  agent any
  stages {
    stage('Git') {
      steps {
        git(url: 'https://github.com/aggads/Maven-demo', branch: '/master*', credentialsId: '3bf6e4b6-dab3-4a9f-8767-41f0bbe57b48')
      }
    }
  }
}