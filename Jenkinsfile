pipeline {
  agent any
  stages {
    stage('Git') {
      steps {
        git(url: 'https://github.com/aggads/Maven-demo', branch: '/master*')
      }
    }
  }
}