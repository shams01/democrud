<template>
    <div>
        <clients-list :clients="clients" />
    </div>
</template>

<script>
    import { addHandler } from 'util/ws.js'
    import ClientsList from 'ClientsList.vue'
    import { getIndex } from 'util/collections'

    export default {
        components: {ClientsList},
        data(){
            return {
                clients: frontendData.clients,
                profile: frontendData.profile
            }
        },
        created() {
            addHandler(data => {
				let index = getIndex(this.clients, data.id)
				if(index > -1){
					this.clients.splice(index, 1, data)
				} else {
					this.clients.push(data)
				}
			})
        }
    }
</script>

<style>

</style>