pipeline {
  agent any
  stages {
    stage('Git') {
      steps {
        git(url: 'https://github.com/aggads/Maven-demo.git', branch: '/master*')
      }
    }
    stage('Build') {
      steps {
        sh 'mvn clean'
      }
    }
  }
}