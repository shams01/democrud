<template>
    <div>
    <input type="text" placeholder="Имя" v-model="name" />
    <input type="text" placeholder="Фамилия" v-model="lastname" />
    <input type="text" placeholder="Номер (6 знаков)" v-model="number" />
    <input type="text" placeholder="Почта" v-model="email" />
    <input type="button" value="Save" @click="save" />
    </div>
</template>

<script>
    import { sendMessage } from 'util/ws'

    export default{
        props: ['clients', 'clientAttr'],
    data(){
        return {
            id:'',
            name:'',
            lastname:'',
            number:'',
            email:''

        }
    },
    watch: {
            clientAttr(newVal, oldVal) {
                this.id = newVal.id
                this.name = newVal.name
                this.lastname = newVal.lastname
                this.number = newVal.number
                this.email = newVal.email

            }
        },

       methods: {
        save(){
            sendMessage({
                id:this.id,
                name:this.name,
                lastname:this.lastname,
                number:this.number,
                email:this.email
            })
            this.id='',
            this.name='',
            this.lastname='',
            this.number='',
            this.email=''
        }
   }
}

</script>

<style>

</style>