// La app ahora vive en /web/. Este archivo retira la versión anterior que estaba en la raíz.
self.addEventListener('install',()=>self.skipWaiting());
self.addEventListener('activate',e=>{e.waitUntil(caches.keys().then(ks=>Promise.all(ks.filter(k=>k.startsWith('ventico-v')).map(k=>caches.delete(k)))).then(()=>self.registration.unregister()))});
