import Vue from 'vue'
import App from 'App.vue'
import VueResource from 'vue-resource'
import { connect } from './util/ws'

connect()

Vue.use (VueResource)

new Vue({
        el:'#app',
        render:a=>a(App)
})