<template>
        <tr>
            <th>{{client.id}}</th>
            <th>{{client.name}} </th>
            <th>{{client.lastname}}</th>
            <th>{{client.number}} </th>
            <th>{{client.email}}</th>
            <th>{{client.user_date}}</th>
            <th>
                <input type="button" @click="edit" value="edit"/>
                <input type="button" @click="del" value="x"/>
            </th>

        </tr>
</template>

<script>
    export default{
        props: ['client', 'editClient', 'deleteClient'],
        methods:{
            edit(){
                this.editClient(this.client)
            },
            del(){
                this.deleteClient(this.client)
            }
        }
    }

</script>

<style>

</style>