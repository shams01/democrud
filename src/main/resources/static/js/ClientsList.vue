<template>
    <div>
        <clients-form :clients="clients" :clientAttr="client"/>
        <table>
            <tr>
                <th>ID</th>
                <th>Имя</th>
                <th>Фамилия</th>
                <th>Номер</th>
                <th>Почта</th>
                <th>Дата создания</th>
                <th></th>
            </tr>
            <client-row v-for="client in clients"
                        :key="client.id"
                        :client="client"
                        :editClient="editClient"
                        :deleteClient="deleteClient"/>
        </table>

    </div>
</template>

<script>
    import ClientsForm from 'ClientsForm.vue'
    import ClientRow from 'ClientRow.vue'

    export default{
        props: ['clients'],
        components: {ClientsForm, ClientRow},
        data(){
            return{
                client:null
            }
        },
        methods:{
            editClient(client){
                this.client=client
            },
            deleteClient(client){
                this.$resource('/api/user{/id}').remove({id:client.id}).then(result=>{
                    if(result.ok){
                        this.clients.splice(this.clients.indexOf(client), 1)
                    }
                })
            }
        }
    }
</script>

<style>

</style>

