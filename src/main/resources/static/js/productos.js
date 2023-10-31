function cargarProductos() {

    // Cargar el archivo JSON
    $.getJSON("productos/productos.json", function(productos) {

        // Agregar los productos al carrusel
        var carruselContenedor = document.querySelector(".carousel-inner");
        var itemCarga = document.querySelector(".itemdecarga");
        var indicadorCarrusel = document.querySelector(".carousel-indicators");

        for (var i = 0; i < productos.length; i++) {
            var producto = productos[i];
            var div = document.createElement("div");
            
            if(productos[i] != null && productos[i] != "" && producto[i].destacado == true ){     
                if(i == 0){
                    carruselContenedor.removeChild(itemCarga);
                    div.className = "carousel-item active";
                }else{
                    var button = document.createElement("button");
                    div.className = "carousel-item";
                    button.setAttribute("type","button");
                    button.setAttribute("data-bs-target","#carouselExampleCaptions");
                    button.setAttribute("data-bs-slide-to",`${i}`);
                    button.setAttribute("aria-label","Slide 2");
                    indicadorCarrusel.appendChild(button);
                }
                
                
                div.innerHTML = `
                <div class="card card${i}">
                    
                    <div class="card-body">
                        <h5 class="card-title">${producto.nombre}</h5>
                        <p class="card-text">${producto.descripcion_corta}</p>
                        <span class="badge text-bg-dark">${producto.marca}</span>
                        <span class="badge text-bg-dark">${producto.categoria}</span>
                        <a href="#" class="btn btn-primary">Mas</a>
                    </div>
                </div>
                `;
            }
            
            carruselContenedor.appendChild(div);
            cargarImagen(productos[i],i);

        }
    });
}

function cargarImagen(producto, i) {

    // Obtener la ruta de la imagen
    var rutaImagen = `../img/${producto.sku}.jpg`;
    console.log(rutaImagen);
    // Obtener el elemento `div` que contendrá la imagen
    var divImagen = document.querySelector(`.card${i}`);

    // Establecer la imagen de fondo del `div`
    divImagen.style.backgroundImage = `url(${rutaImagen})`;
}

$(document).ready(function() {
    cargarProductos();
});