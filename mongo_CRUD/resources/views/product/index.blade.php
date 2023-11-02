<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <!-- font-awesome cdnjs -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">  
     <!--Google fonts-->
     <link rel="preconnect" href="https://fonts.googleapis.com">
     <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
     <link href="https://fonts.googleapis.com/css2?family=Courgette&family=Poppins:wght@200;400&display=swap" rel="stylesheet">
      
    <title>stock</title>
</head>
<body style="font-family: 'Poppins' ">
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
          <a class="navbar-brand " href="#"><img src="/images/logo_universite_thies-removebg-preview.png" alt="" height="80px" width="80px"></a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
              <a class="nav-link active pb-1 badge bg-primary fs-6" aria-current="page" href="{{route('Product.create')}}"style="color: white;" onmouseover=" this.style.color='#f2f2f2'; this.style.backgroundColor='';" onmouseout="this.style.backgroundColor=''; this.style.color='#ffff';">ENREGISTRER UN VETEMENT</a>
            </div>
          </div>
        </div>
      </nav>
      <div class="container">
             <div class="d-flex flex-column align-items-center justify-content-center mt-3">
                 <h3 class="text-center"><span class="badge rounded-pill bg-secondary mb-2" style="">STOCK DE VETEMENTS</span></h3>
                  @if(session('success'))
                          <div class="alert alert-primary alert-dismissible fade show mt-2" role="alert">
                              {{session('success')}}
                              <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                          </div>
                   @endif
                    <table class="table table-striped table-bordered mt-3 fs-6">
                      <thead>
                          <tr class="bg-secondary" style="color: white">
                          <th scope="col">NOM</th>
                          <th scope="col">DESCRIPTION</th>
                          <th scope="col">PRIX</th>
                          <th scope="col">QUANTITE</th>
                          <th scope="col">TAILLE</th>
                          <th scope="col">GENRE</th>
                          <th scope="col">IMAGE</th>
                          <th scope="col">ACTION</th>
                          </tr>
                      </thead>
                      <tbody>
                      @foreach($data as $key => $value)         
                                  <tr> 
                                      <td>{{$value->name}}</td>
                                      <td>{{$value->description}}</td>
                                      <td>{{$value->price}} €</td>
                                      <td>{{$value->quantity}}</td>
                                      <td>{{$value->size}}</td>
                                      <td>{{$value->gender}}</td>
                                      <td><img src="{{ Storage::url($value->file) }}" width="80px" height="80px" alt="" class="rounded float-start"></td>
                                      <td colspan="2">
                                        <a href="{{route('Product.edit',$value->_id)}}" class="text-decoration-none"><button class="btn btn-secondary ">EDIT</button></a>
                                        <a href="{{route('Product.show',$value->_id)}}" class="text-decoration-none"><button class="btn btn-danger">DELETE</button></a>
                                      </td>
                                  </tr>
                          @endforeach
                      </tbody>
                      </table>
                  
              </div>
       </div>
     <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>