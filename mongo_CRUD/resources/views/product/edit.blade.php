<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"> 
    <link rel="preconnect" href="https://fonts.googleapis.com">
      <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
      <link href="https://fonts.googleapis.com/css2?family=Courgette&family=Poppins&display=swap" rel="stylesheet">
       <title>CRUD GESTION DE STOCK</title>
</head>

<body style="font-family: 'Poppins' ">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#"><img src="../images/logo_universite_thies-removebg-preview.png" alt="UIDT" height="80px" width="80px"></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
        <div class="navbar-nav">
            <a class="nav-link active pb-1 badge bg-primary fs-6 " aria-current="page" href="{{route('Product.index')}}" style="color: white;" onmouseover=" this.style.color='#f2f2f2'; this.style.backgroundColor='';" onmouseout="this.style.backgroundColor=''; this.style.color='#ffff';
             this.style['border-bottom']='';">VISUALISER LE STOCK DE VETEMENTS</a>
        </div>
        </div>
    </div>
    </nav>  
    <div class="container">
        <div class="en_tete d-flex align-items-center justify-content-center mb-3 mt-3">
          <h3><span class="badge bg-secondary" >GESTION DE STOCK DE VETEMENTS</span></h3>            
        </div>
        <div class="d-flex justify-content-center ">
            <div class="col-7">  
                @if(session('success'))
                  <div class="alert alert-primary alert-dismissible fade show" role="alert">
                      {{session('success')}}
                      <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                  </div>
                @endif  
                <div class="formulaire">
                    <form action="{{route('Product.update',$data->_id)}}" method="POST" enctype="multipart/form-data"> 
                        @csrf    
                        @method('patch')         
                        <input class="form-control mb-3" type="text" placeholder="Nom" name="name"  value="{{$data->name}}">
                        @error('name') <p class="text text-danger">{{$message}}</p>@enderror                     
                        <textarea class="form-control" placeholder="Description" name="description" style="height: 100px" >{{$data->description}}</textarea></br>
                        @error('description') <p class="text text-danger">{{$message}}</p>@enderror
                        <input class="form-control mb-3" type="number" placeholder="Prix €" name="price" style="width: 150px" value="{{$data->price}}">
                        @error('price') <p class="text text-danger">{{$message}}</p>@enderror
                        <input class="form-control mb-3" type="number" placeholder="Quantité" name="quantity" style="width: 150px" value="{{$data->quantity}}" min=1>
                        @error('quantity') <p class="text text-danger">{{$message}}</p>@enderror         
                        <select class="form-select" aria-label="Default select example" style="width: 150px" name="size" ><br>
                            <option selected>Taille</option>
                            <option value="Small">S</option>
                            <option value="Medium">M</option>
                            <option value="Large">L</option>
                            <option value="X_Large">XL</option>
                            <option value="XX_Large">XXL</option>
                        </select><br>
                        @error('size') <p class="text text-danger">{{$message}}</p>@enderror  
                        <input type="radio" name="gender" id="masculin" value="Homme">
                        <label for="masculin">Homme</label><br>
                        <input type="radio" name="gender" id="Féminin" value="Femme" class="mb-0">
                        <label for="Feminin">Femme</label><br>
                        @error('gender') <p class="text text-danger">{{$message}}</p>@enderror
                        <br><label for="formFile" class="form-label mt-1">inserer l'image du produit</label><br>
                        <input class="form-control mt-1" type="file" id="formFile" accept="image/*" name="file" value="{{$data->file}}"  >
                        @error('file') <p class="text text-danger">{{$message}}</p>@enderror
                        <button type="submit" class="btn btn-success mt-3 mb-3" name="submit">Modifier</button>
                      <!--  <a href="{{route('Product.index')}}" class="badge bg-secondary float-end mt-3 text-decoration-none fs-6" style="width: 50%; height:30px " onmouseover=" this.style.color='#2ED1A6';"
                       onmouseout="this.style.backgroundColor=''; this.style.color='';"
                        >VISUALISER LE STOCK DE VETEMENTS</a> -->
                        <!--<button type="submit" class="btn btn-primary mt-5 mb-3" name="editSubmit">modifier</button>-->
                    </form>
                
                </div>
                
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>